package com.pedrosapplication.app.modules.meusdados.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityMeusDadosBinding
import com.pedrosapplication.app.modules.meusdados.`data`.viewmodel.MeusDadosVM
import com.pedrosapplication.app.modules.meusdadosnovasenha.ui.MeusDadosNovaSenhaActivity
import kotlin.String
import kotlin.Unit

class MeusDadosActivity : BaseActivity<ActivityMeusDadosBinding>(R.layout.activity_meus_dados) {
  private val viewModel: MeusDadosVM by viewModels<MeusDadosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meusDadosVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnNovaSenha.setOnClickListener {
      val destIntent = MeusDadosNovaSenhaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MEUS_DADOS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MeusDadosActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
