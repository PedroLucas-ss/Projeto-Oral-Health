package com.pedrosapplication.app.modules.meusdados.`data`.model

import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MeusDadosModel(
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
  var etGroupSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
