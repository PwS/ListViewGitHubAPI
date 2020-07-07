package com.application.androidgithubapi.model

import com.google.gson.annotations.SerializedName

/**
 * Created by PwS on 6/25/2020
 */
//Plain Old Object
class GithubUser {
    var id = 0
    var login: String? = null

    //CustomFieldUsingAnnotationSerializable
    @SerializedName("avatar_url")
    var avatarUrl: String? = null
    var url: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("followers_url")
    var followersUrl: String? = null

    @SerializedName("following_url")
    var followingUrl: String? = null

    @SerializedName("gists_url")
    var gistsUrl: String? = null

    @SerializedName("starred_url")
    var starredUrl: String? = null

    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null

    @SerializedName("organizations_url")
    var organizationsUrl: String? = null

    @SerializedName("repos_url")
    var reposUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null
    var name: String? = null

}