package com.transit.nyc.example.testtransitapplication

import android.graphics.drawable.PictureDrawable
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.load.resource.SimpleResource
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder
import com.caverock.androidsvg.SVG

/**
 * Created by Owner on 2017-11-27.
 */
class SsvDrawableTranscoder : ResourceTranscoder<SVG, PictureDrawable> {
    override fun transcode(toTranscode: Resource<SVG>?, options: Options?): Resource<PictureDrawable> {
        val svg: SVG ?= toTranscode?.get()
        val picture = svg?.renderToPicture()
        val drawable = PictureDrawable(picture)
        return SimpleResource<PictureDrawable>(drawable)
    }

}