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
        categoryItemList.add(HorizontalModel(1, R.drawable.tree))
        categoryItemList.add(HorizontalModel(1, R.drawable.lion))
        categoryItemList.add(HorizontalModel(1, R.drawable.city))
        categoryItemList.add(HorizontalModel(1, R.drawable.france))
        categoryItemList.add(HorizontalModel(1, R.drawable.jumping))

        val categoryItemList2: MutableList<HorizontalModel> = ArrayList()
        categoryItemList2.add(HorizontalModel(1, R.drawable.france))
        categoryItemList2.add(HorizontalModel(1, R.drawable.jumping))
        categoryItemList2.add(HorizontalModel(1, R.drawable.city))
        categoryItemList2.add(HorizontalModel(1, R.drawable.tree))
        categoryItemList2.add(HorizontalModel(1, R.drawable.lion))

        val categoryItemList3: MutableList<HorizontalModel> = ArrayList()
        categoryItemList3.add(HorizontalModel(1, R.drawable.lion))
        categoryItemList3.add(HorizontalModel(1, R.drawable.jumping))
        categoryItemList3.add(HorizontalModel(1, R.drawable.city))
        categoryItemList3.add(HorizontalModel(1, R.drawable.france))
        categoryItemList3.add(HorizontalModel(1, R.drawable.jumping))

        val categoryItemList4: MutableList<HorizontalModel> = ArrayList()
        categoryItemList4.add(HorizontalModel(1, R.drawable.city))
        categoryItemList4.add(HorizontalModel(1, R.drawable.france))
        categoryItemList4.add(HorizontalModel(1, R.drawable.tree))
        categoryItemList4.add(HorizontalModel(1, R.drawable.france))
        categoryItemList4.add(HorizontalModel(1, R.drawable.jumping))

        val categoryItemList5: MutableList<HorizontalModel> = ArrayList()
        categoryItemList5.add(HorizontalModel(1, R.drawable.jumping))
        categoryItemList5.add(HorizontalModel(1, R.drawable.france))
        categoryItemList5.add(HorizontalModel(1, R.drawable.city))
        categoryItemList5.add(HorizontalModel(1, R.drawable.france))
        categoryItemList5.add(HorizontalModel(1, R.drawable.jumping))

        val categoryItemList6: MutableList<HorizontalModel> = ArrayList()
        categoryItemList6.add(HorizontalModel(1, R.drawable.city))
        categoryItemList6.add(HorizontalModel(1, R.drawable.lion))
        categoryItemList6.add(HorizontalModel(1, R.drawable.jumping))
        categoryItemList6.add(HorizontalModel(1, R.drawable.france))
        categoryItemList6.add(HorizontalModel(1, R.drawable.france))

        val categoryItemList7: MutableList<HorizontalModel> = ArrayList()
        categoryItemList7.add(HorizontalModel(1, R.drawable.tree))
        categoryItemList7.add(HorizontalModel(1, R.drawable.lion))
        categoryItemList7.add(HorizontalModel(1, R.drawable.city))
        categoryItemList7.add(HorizontalModel(1, R.drawable.france))
        categoryItemList7.add(HorizontalModel(1, R.drawable.jumping))

        val verticalCategory: MutableList<VerticalModel> = ArrayList()
        verticalCategory.add(VerticalModel("Feature", categoryItemList))
        verticalCategory.add(VerticalModel("Home", categoryItemList2))
        verticalCategory.add(VerticalModel("AWAY", categoryItemList3))
        verticalCategory.add(VerticalModel("Go for it", categoryItemList4))
        verticalCategory.add(VerticalModel("Take action", categoryItemList5))
        verticalCategory.add(VerticalModel("Right now", categoryItemList6))
        verticalCategory.add(VerticalModel("Finished RV", categoryItemList7))

        setMainCategoryRecycler(verticalCategory)

    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val view = inflater.inflate(R.layout.fragment_food_menu, container, false)
//
//
//
//        return view
//    }

    private fun setMainCategoryRecycler(everyCategory: List<VerticalModel>) {
        mainCategoryRecycler = binding.mainRecycler
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(requireContext())
        mainCategoryRecycler!!.layoutManager = layoutManager
        mainRecyclerAdapter = VerticalAdapter(requireContext(), everyCategory)
        mainCategoryRecycler!!.adapter =mainRecyclerAdapter
    }

}