package com.aristidevs.paging3tutorial.data.response

import com.google.gson.annotations.SerializedName

data class InfoResponse(
    @SerializedName("count") val count:Int,
    @SerializedName("pages") val pages:Int,
    @SerializedName("next") val next:String?,
    @SerializedName("prev") val prev:String?,
)