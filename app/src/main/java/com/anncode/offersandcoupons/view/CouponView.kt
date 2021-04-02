package com.anncode.offersandcoupons.view

import com.anncode.offersandcoupons.model.Coupon

interface CouponView {
    //View
    fun getCoupons()

    //Presenter
    fun showCoupons(coupons: ArrayList<Coupon>?)
}