@file:JvmName("ExtensionsUtils")

package ru.julappdev.kedditbysteps.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by yulia on 17.09.16.
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}
