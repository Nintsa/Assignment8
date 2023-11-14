package com.example.assignment8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment8.databinding.ItemRecyclerviewBinding

class UsersAdapter (private var Users:MutableList<UsersInfo>) :
    RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(
            ItemRecyclerviewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return Users.size
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
    }

    inner class UsersViewHolder(private val binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }
}