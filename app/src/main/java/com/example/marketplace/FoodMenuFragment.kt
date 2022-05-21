package com.example.marketplace

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentFoodMenuBinding
import com.example.marketplace.recyclerview.adapter.NewVerticalAdapter
import com.example.marketplace.recyclerview.adapter.VerticalAdapter
import com.example.marketplace.recyclerview.model.HorizontalModel
import com.example.marketplace.recyclerview.model.NewVerticalModel
import com.example.marketplace.recyclerview.model.VerticalModel

class FoodMenuFragment : BaseFragment<FragmentFoodMenuBinding>(FragmentFoodMenuBinding::inflate) {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: VerticalAdapter? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryItemList: MutableList<HorizontalModel> = ArrayList()
        categoryItemList.add(HorizontalModel(R.drawable.food1, "Toronto Food"))
        categoryItemList.add(HorizontalModel(R.drawable.food2, "Dessert"))
        categoryItemList.add(HorizontalModel(R.drawable.food3, "Magic food"))
        categoryItemList.add(HorizontalModel(R.drawable.food4, "Great"))

//        val categoryItemList2: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList2.add(HorizontalModel(R.drawable.food4,  "Shedevr"))
//        categoryItemList2.add(HorizontalModel(R.drawable.food3,"Prim"))
//        categoryItemList2.add(HorizontalModel(R.drawable.food2,"Nurbek food"))
//        categoryItemList2.add(HorizontalModel(R.drawable.food1,"Sharshara food"))
//
//        val categoryItemList3: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList3.add(HorizontalModel(R.drawable.food3,"Go go go"))
//        categoryItemList3.add(HorizontalModel(R.drawable.food1,"Tasty"))
//        categoryItemList3.add(HorizontalModel(R.drawable.food3,"Take it"))
//        categoryItemList3.add(HorizontalModel(R.drawable.food4," You food"))
//
//        val categoryItemList4: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList4.add(HorizontalModel(R.drawable.food1, "Toronto Food"))
//        categoryItemList4.add(HorizontalModel(R.drawable.food2, "Dessert"))
//        categoryItemList4.add(HorizontalModel(R.drawable.food3, "Magic food"))
//        categoryItemList4.add(HorizontalModel(R.drawable.food4, "Great"))
//
//        val categoryItemList5: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList5.add(HorizontalModel(R.drawable.food4,  "Shedevr"))
//        categoryItemList5.add(HorizontalModel(R.drawable.food3,"Prim"))
//        categoryItemList5.add(HorizontalModel(R.drawable.food2,"Nurbek food"))
//        categoryItemList5.add(HorizontalModel(R.drawable.food1,"Sharshara food"))
//
//        val categoryItemList6: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList6.add(HorizontalModel(R.drawable.food3,"Go go go"))
//        categoryItemList6.add(HorizontalModel(R.drawable.food1,"Tasty"))
//        categoryItemList6.add(HorizontalModel(R.drawable.food3,"Take it"))
//        categoryItemList6.add(HorizontalModel(R.drawable.food4," You food"))
//
//        val categoryItemList7: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList7.add(HorizontalModel(R.drawable.food1,"Rooster"))
//        categoryItemList7.add(HorizontalModel(R.drawable.food2,"Pizza"))
//        categoryItemList7.add(HorizontalModel(R.drawable.food3,"Fast food"))
//        categoryItemList7.add(HorizontalModel(R.drawable.food4,"Strawberry"))

        val newVerticalCategory: MutableList<NewVerticalModel> = ArrayList()
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 1"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 2"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 3"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 4"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 5"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 6"))
        newVerticalCategory.add(NewVerticalModel(R.drawable.vfood1, "Food name 7"))

        val verticalCategory: MutableList<VerticalModel> = ArrayList()
        verticalCategory.add(VerticalModel("Featured", categoryItemList))
//        verticalCategory.add(VerticalModel("BollyWood", categoryItemList2))
//        verticalCategory.add(VerticalModel("Best", categoryItemList3))
//        verticalCategory.add(VerticalModel("Phenomena", categoryItemList4))
//        verticalCategory.add(VerticalModel("Unusual",categoryItemList5))
//        verticalCategory.add(VerticalModel("Usual",categoryItemList6))
//        verticalCategory.add(VerticalModel("Ordinary",categoryItemList7))



        setMainCategoryRecycler(verticalCategory)
        setVerticalRecycler(newVerticalCategory)
    }

    private fun setMainCategoryRecycler(everyCategory: List<VerticalModel>) {
        mainCategoryRecycler = binding.mainRecyclerHorizontal
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = VerticalAdapter(requireContext(), everyCategory)
        mainCategoryRecycler!!.adapter =mainRecyclerAdapter
    }

    private fun setVerticalRecycler(newCategory: List<NewVerticalModel>){
        val newVerticalRV: RecyclerView = binding.mainRecyclerVertical
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())
        newVerticalRV.layoutManager = layoutManager
        val newVerticalAdapter = NewVerticalAdapter(requireContext(), newCategory)
        newVerticalRV.adapter = newVerticalAdapter

    }

}