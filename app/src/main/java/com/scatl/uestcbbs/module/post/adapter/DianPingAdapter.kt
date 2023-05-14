package com.scatl.uestcbbs.module.post.adapter

import android.widget.ImageView
import com.chad.library.adapter.base.BaseViewHolder
import com.scatl.uestcbbs.R
import com.scatl.uestcbbs.entity.PostDianPingBean
import com.scatl.uestcbbs.manager.BlackListManager
import com.scatl.uestcbbs.helper.PreloadAdapter
import com.scatl.uestcbbs.util.load

/**
 * Created by sca_tl at 2023/4/12 13:32
 */
class DianPingAdapter(layoutResId: Int, onPreload: (() -> Unit)? = null) :
    PreloadAdapter<PostDianPingBean, BaseViewHolder>(layoutResId, onPreload) {

    fun addData(data: List<PostDianPingBean>, refresh: Boolean) {
        val newList: MutableList<PostDianPingBean> = ArrayList()
        for (i in data.indices) {
            if (!BlackListManager.INSTANCE.isBlacked(data[i].uid)) {
                newList.add(data[i])
            }
        }
        if (refresh) {
            setNewData(newList)
        } else {
            addData(newList)
        }
    }

    override fun convert(helper: BaseViewHolder, item: PostDianPingBean) {
        helper
            .setText(R.id.name, item.userName)
            .setText(R.id.comment, item.comment)
            .setText(R.id.date, item.date)
            .addOnClickListener(R.id.root_layout)
        helper.getView<ImageView>(R.id.avatar).load(item.userAvatar)
    }

}