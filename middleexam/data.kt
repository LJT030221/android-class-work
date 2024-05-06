package com.example.middleexam
import androidx.compose.runtime.Immutable
import  androidx.compose.ui.graphics.Color

@Immutable
data class Teacher(
    val name:String,
    val number: Int,
    val balance:Float,
    val color: Color
)

@Immutable
data class Student(
    val name: String,
    val due:String,
    val amount:Float,
    val color: Color
)
object  UserData{
    val accounts:List<Teacher> = listOf(
        Teacher(
            "Checking",
            1234,
            2215.13f,
            Color(0xFF004948)
        ),
        Teacher(
            "Home Savings",
            5678,
            987.48f,
            Color(0xFF005D57)
        ),
        Teacher(
            "Car Savings",
            9812,
            987.48f,
            Color(0xFF84897F)
        ),
        Teacher(
            "Vacation",
            3456,
            253f,
            Color(0xFF37EFBA)
        ),
    )

    val bills:List<Student> = listOf(
        Student(
            "庄晓铭",
            "Jan 21",
            45.36f,
            Color(0xFFFFDC78)
        ),
        Student(
            "Rent",
            "Feb 9",
            1200f,
            Color(0xFFFF6951)
        ),
        Student(
            "TabFine Credit",
            "Feb 22",
            87.33f,
            Color(0xFFFF6951)
        ),
        Student(
            "ABC Loans",
            "Feb 29",
            400f,
            Color(0xFFFFAC12)
        ),
        Student(
            "ABC Loans 2",
            "Feb 29",
            77.4f,
            Color(0xFFFFAC12)
        )
    )
    fun getAccount(accountName:String?): Teacher {
        return  accounts.first{it.name==accountName}
    }
}