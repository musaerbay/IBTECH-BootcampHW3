package com.mr.bootcampweek3.ui.model

import java.io.Serializable

data class AvatarModel(
    val text: String?,
    val image: Int?,
    val viewType: Int,
    val checkbox: Boolean = false
) : Serializable
