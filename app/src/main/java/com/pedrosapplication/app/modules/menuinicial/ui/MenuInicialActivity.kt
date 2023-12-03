package com.pedrosapplication.app.modules.menuinicial.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.pedrosapplication.app.R
import com.pedrosapplication.app.appcomponents.base.BaseActivity
import com.pedrosapplication.app.databinding.ActivityMenuInicialBinding
import com.pedrosapplication.app.modules.menuinicial.`data`.model.MenuInicialRowModel
import com.pedrosapplication.app.modules.menuinicial.`data`.viewmodel.MenuInicialVM
import com.pedrosapplication.app.modules.meusdados.ui.MeusDadosActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuInicialActivity : BaseActivity<ActivityMenuInicialBinding>(R.layout.activity_menu_inicial)
    {
  private val viewModel: MenuInicialVM by viewModels<MenuInicialVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val menuInicialAdapter =
    MenuInicialAdapter(viewModel.menuInicialList.value?:mutableListOf())
    binding.recyclerMenuInicial.adapter = menuInicialAdapter
    menuInicialAdapter.setOnItemClickListener(
    object : MenuInicialAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MenuInicialRowModel) {
        onClickRecyclerMenuInicial(view, position, item)
      }
    }
    )
    viewModel.menuInicialList.observe(this) {
      menuInicialAdapter.updateData(it)
    }
    binding.menuInicialVM = viewModel
    setUpSearchViewPesquisarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imagePerfil.setOnClickListener {
      val destIntent = MeusDadosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMenuInicial(
    view: View,
    position: Int,
    item: MenuInicialRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewPesquisarListener(): Unit {
    binding.searchViewPesquisar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "MENU_INICIAL_ACTIVITY"

    }
  }
