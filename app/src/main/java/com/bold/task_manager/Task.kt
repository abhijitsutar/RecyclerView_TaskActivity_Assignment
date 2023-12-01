package com.bold.task_manager

data class Task(
    var Project_id:Int,
    var Project_name:String,
    var Due_Date :String,
    var Project_Body:String,
    var Status:String
) {
}