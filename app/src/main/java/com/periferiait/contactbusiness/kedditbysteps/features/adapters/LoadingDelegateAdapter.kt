package com.periferiait.contactbusiness.kedditbysteps.features.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.periferiait.contactbusiness.kedditbysteps.R
import com.periferiait.contactbusiness.kedditbysteps.commons.adapters.ViewType
import com.periferiait.contactbusiness.kedditbysteps.commons.adapters.ViewTypeDelegateAdapter
import com.periferiait.contactbusiness.kedditbysteps.commons.extensions.inflate

/**
 * Created by admin on 20/09/17.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(Parent: ViewGroup) = LoadingViewHolder(Parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {}

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading))

}