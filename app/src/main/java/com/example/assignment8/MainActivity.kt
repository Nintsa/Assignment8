package com.example.assignment8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignment8.databinding.ActivityMainBinding

//   შექმენით გვერდი UsersActivity, სადაც განთავსებული იქნება მომხარებლების სია და
//მომხმარებლის დამატების ღილაკი (ImageButton). სიის თითოეულ აითემზე ხელმისაწვდომი უნდა იყოს შემდეგი ვიზაულური კომპონენტები :
//
//სახელი
//გვარი
//ლექტრონული ფოსტა
//წაშლისა და შეცვლის ღილაკები (ImageButton)
//
//წაშლის ღილაკზე დაჭერის შემდეგ ამორჩეული აითემი წაიშალოს სიის ჩამონათვალიდან, ისე რომ არ მოხდეს დანარჩენი აითემების განახლება.
// შეცვლის ღილაკზე დაჭერის შემდეგ გახსენით UserActivity, სადაც შესაყვან ფილდებში უნდა იყოს აითემის ინფორმაცია მითითებული.
// თუ მონაცემები შეიცვლება “შენახვა” ღილაკზე დაჭერის Შემდეგ აპლიკაცია უნდა დაბრუნდეს UsersActivity-ზე და
//
//
// განახლდეს მხოლოდ ამორჩეული აითემი.
class MainActivity : AppCompatActivity() {

    private var Users = mutableListOf<UsersInfo>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fillUserList()
        btnActions()

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = UsersAdapter(Users = Users)


    }

    fun btnActions(){
        addBtnAction()
        updateBtnAction()
        deleteBtnAction()
    }

    fun addBtnAction(){
        binding.btnAdd.setOnClickListener {
            val intentAddBtn = Intent(this, UserActivity::class.java)
            startActivity(intentAddBtn)
        }
    }



    private fun fillUserList() {
        Users.also {
            it.add(
                UsersInfo(
                    name = "Nintsa",
                    surname = "Kemularia",
                    mail = "Nintsa@gmail.com"
                )
            )
            it.add(
                UsersInfo(
                    name = "Marita",
                    surname = "Kemularia",
                    mail = "Marita@gmail.com"
                )
            )
            it.add(
                UsersInfo(
                    name = "Ioane",
                    surname = "Kemularia",
                    mail = "Ioane@gmail.com"
                )
            )
            it.add(
                UsersInfo(
                    name = "Shio",
                    surname = "Kemularia",
                    mail = "Shio@gmail.com"
                )
            )
        }
    }
}