package com.scatl.uestcbbs.module.post.view

import com.scatl.uestcbbs.base.BaseView
import com.scatl.uestcbbs.entity.*

/**
 * Created by tanlei02 on 2022/12/5 10:56
 */
interface NewPostDetailView: BaseView {
    fun onGetPostDetailSuccess(postDetailBean: PostDetailBean)
    fun onVoteSuccess(voteResultBean: VoteResultBean)
    fun onVoteError(msg: String?)
    fun onFavoritePostSuccess(favoritePostResultBean: FavoritePostResultBean)
    fun onFavoritePostError(msg: String?)
    fun onSupportSuccess(supportResultBean: SupportResultBean, action: String, type: String)
    fun onSupportError(msg: String?)
    fun onGetPostDetailError(msg: String?)
    fun onGetPostWebDetailSuccess(postWebBean: PostWebBean)
}