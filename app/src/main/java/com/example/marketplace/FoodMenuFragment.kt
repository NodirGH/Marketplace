package com.example.marketplace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.marketplace.core.BaseFragment
import com.example.marketplace.databinding.FragmentFoodMenuBinding
import com.example.marketplace.recyclerview.adapter.VerticalAdapter
import com.example.marketplace.recyclerview.model.HorizontalModel
import com.example.marketplace.recyclerview.model.VerticalModel

class FoodMenuFragment : BaseFragment<FragmentFoodMenuBinding>(FragmentFoodMenuBinding::inflate) {

    private var mainCategoryRecycler: RecyclerView? = null
    private var mainRecyclerAdapter: VerticalAdapter? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryItemList: MutableList<HorizontalModel> = ArrayList()
        categoryItemList.add(HorizontalModel(R.drawable.food1, "Toronto Restaurant"))
        categoryItemList.add(HorizontalModel( R.drawable.food2, "Magic Dessert"))
        categoryItemList.add(HorizontalModel(R.drawable.food3, "Newbie Tie"))
        categoryItemList.add(HorizontalModel(R.drawable.food4, "Lavash"))

//        val categoryItemList2: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList2.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList2.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList2.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList2.add(HorizontalModel(1, R.drawable.food4, "Lavash"))
//
//        val categoryItemList3: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList3.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList3.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList3.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList3.add(HorizontalModel(1, R.drawable.food4, "Lavash"))
//
//        val categoryItemList4: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList4.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList4.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList4.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList4.add(HorizontalModel(1, R.drawable.food4, "Lavash"))
//
//        val categoryItemList5: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList5.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList5.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList5.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList5.add(HorizontalModel(1, R.drawable.food4, "Lavash"))
//
//        val categoryItemList6: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList6.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList6.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList6.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList6.add(HorizontalModel(1, R.drawable.food4, "Lavash"))
//
//        val categoryItemList7: MutableList<HorizontalModel> = ArrayList()
//        categoryItemList7.add(HorizontalModel(1, R.drawable.food1, "Toronto Restaurant"))
//        categoryItemList7.add(HorizontalModel(1, R.drawable.food2, "Magic Dessert"))
//        categoryItemList7.add(HorizontalModel(1, R.drawable.food3, "Newbie Tie"))
//        categoryItemList7.add(HorizontalModel(1, R.drawable.food4, "Lavash"))

        val verticalCategory: MutableList<VerticalModel> = ArrayList()
        verticalCategory.add(VerticalModel("Feature", categoryItemList))
//        verticalCategory.add(VerticalModel("Home", categoryItemList2))
//        verticalCategory.add(VerticalModel("AWAY", categoryItemList3))
//        verticalCategory.add(VerticalModel("Go for it", categoryItemList4))
//        verticalCategory.add(VerticalModel("Take action", categoryItemList5))
//        verticalCategory.add(VerticalModel("Right now", categoryItemList6))
//        verticalCategory.add(VerticalModel("Finished RV", categoryItemList7))

        setMainCategoryRecycler(verticalCategory)

    }

    private fun setMainCategoryRecycler(everyCategory: List<VerticalModel>) {
        mainCategoryRecycler = binding.mainRecycler
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = VerticalAdapter(requireContext(), everyCategory)
        mainCategoryRecycler!!.adapter =mainRecyclerAdapter
    }

}