package com.pedrosapplication.app.modules.menuinicial.`data`.model

import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuInicialRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAFTA: String? = MyApp.getInstance().resources.getString(R.string.lbl_afta)

)
