package com.periferiait.contactbusiness.kedditbysteps.commons.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by admin on 20/09/17.
 */
interface ViewTypeDelegateAdapter {
    fun onCreateViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
    fun onBindViewHolder(holder : RecyclerView.ViewHolder, item : ViewType)
}