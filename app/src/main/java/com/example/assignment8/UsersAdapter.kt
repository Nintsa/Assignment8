package com.example.assignment8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment8.databinding.ActivityMainBinding
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
        val currentUser = Users[position]
        holder.binding.tvName.text = currentUser.name
        holder.binding.tvSurname.text = currentUser.surname
        holder.binding.tvMail.text = currentUser.mail

    }

    inner class UsersViewHolder(val binding: ItemRecyclerviewBinding) :
        RecyclerView.ViewHolder(binding.root)
}