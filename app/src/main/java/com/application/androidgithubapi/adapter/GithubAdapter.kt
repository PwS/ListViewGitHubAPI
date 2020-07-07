package com.application.androidgithubapi.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.application.androidgithubapi.R
import com.application.androidgithubapi.model.GithubUser
import com.squareup.picasso.Picasso

/**
 * Created by PwS on 6/25/2020
 */
class GithubAdapter(
    context: Context,
    resource: Int,
    private val data: List<GithubUser>
) : ArrayAdapter<GithubUser?>(context, resource, data) {
    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View {
        var convertView = convertView
        val gu = data[position]
        val inflater = LayoutInflater.from(getContext())
        convertView = inflater.inflate(R.layout.github_user, parent, false)
        val txtViewName = convertView.findViewById<TextView>(R.id.txtName)
        val txtViewBio = convertView.findViewById<TextView>(R.id.txtBio)
        val imageViewUser =
            convertView.findViewById<ImageView>(R.id.githubAuthImage)
        Picasso.get().load(gu.avatarUrl).into(imageViewUser)
        txtViewName.text = gu.login
        txtViewBio.text = gu.htmlUrl
        return convertView
    }

}