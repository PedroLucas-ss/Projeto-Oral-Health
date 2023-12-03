package com.pedrosapplication.app.modules.telalogindr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityTelaLoginDrBinding
import com.pedrosapplication.app.modules.novasenha.ui.NovaSenhaActivity
import com.pedrosapplication.app.modules.telacadastrodr.ui.TelaCadastroDrActivity
import com.pedrosapplication.app.modules.telalogindr.`data`.viewmodel.TelaLoginDrVM
import kotlin.String
import kotlin.Unit

class TelaLoginDrActivity :
    BaseActivity<ActivityTelaLoginDrBinding>(R.layout.activity_tela_login_dr) {
  private val viewModel: TelaLoginDrVM by viewModels<TelaLoginDrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaLoginDrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtNopossuiuma.setOnClickListener {
      val destIntent = TelaCadastroDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtEsqueceuasenh.setOnClickListener {
      val destIntent = NovaSenhaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_LOGIN_DR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelaLoginDrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
