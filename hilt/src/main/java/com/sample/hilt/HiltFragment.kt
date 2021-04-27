package com.sample.hilt

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 *  @author mzp
 *  date : 2021/4/27
 *  desc :
 */
@AndroidEntryPoint
class HiltFragment : Fragment() {
    @Inject
    lateinit var userBean: UserBean
    @Inject
    lateinit var outSideBean: OutSideBean

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        Log.e("hilt test", "${userBean.name} 已经 ${userBean.age} 岁了")
        Log.e("hilt test", outSideBean.toString())
        Log.e("hilt test", HiltModule.toString())
    }
}