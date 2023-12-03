package com.pedrosapplication.app.modules.meusdadosmudar.`data`.model

import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MeusDadosMudarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNomeAtual: String? = MyApp.getInstance().resources.getString(R.string.lbl_nome_atual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailAtual: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_atual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNmeroAtual: String? = MyApp.getInstance().resources.getString(R.string.lbl_n_mero_atual)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightValue: String? = null
)
