package com.periferiait.contactbusiness.kedditbysteps.commons.extensions

import android.os.Parcel
import android.os.Parcelable
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.periferiait.contactbusiness.kedditbysteps.R
import com.squareup.picasso.Picasso

/**
 * Created by admin on 20/09/17.
 */

// Inline function to create Parcel Creator
inline fun <reified T : Parcelable> createParcel(crossinline createFromParcel: (Parcel) -> T?): Parcelable.Creator<T> =
        object : Parcelable.Creator<T> {
            override fun createFromParcel(source: Parcel): T? = createFromParcel(source)
            override fun newArray(size: Int): Array<out T?> = arrayOfNulls(size)
        }


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

// custom readParcelable to avoid reflection
fun <T : Parcelable> Parcel.readParcelable(creator: Parcelable.Creator<T>): T? {
    if (readString() != null) return creator.createFromParcel(this) else return null
}


fun ImageView.loadImg(imageUrl: String) {
    if (TextUtils.isEmpty(imageUrl)) {
        Picasso.with(context).load(R.mipmap.ic_launcher).into(this)
    } else {
        Picasso.with(context).load(imageUrl).into(this)
    }
}