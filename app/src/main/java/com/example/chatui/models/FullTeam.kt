package com.example.chatui.models

import com.google.gson.annotations.SerializedName

class FullTeam {

    @SerializedName("id")
    var id: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("occupationArea")
    var occupationArea: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("totalCollaborators")
    var totalCollaborators: Int? = null
    @SerializedName("imgUrl")
    var imgUrl: String? = null
    @SerializedName("members")
    var members: List<User>? = null

    constructor( id: String, name: String, occupationArea: String, description: String, totalCollaborators: Int, imgUrl: String, members: List<User>) {
        this.id = id
        this.name = name
        this.occupationArea = occupationArea
        this.description = description
        this.totalCollaborators = totalCollaborators
        this.imgUrl = imgUrl
        this.members = members
    }

    constructor()
}