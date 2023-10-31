package com.example.a37

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
                var answer = Array<IntArray>(arr1.size,{Array<Int>(arr1[0].size,{0}).toIntArray()})

                for(i in 0..arr1.size-1){
                    for(j in 0.. arr1[0].size-1){
                        answer[i][j] = arr1[i][j] + arr2[i][j]
                    }
                }
                return answer
            }
        }
        val a = Solution()
        a.solution(arrayOf<IntArray>(intArrayOf(1,2),intArrayOf(2,3)),arrayOf<IntArray>(intArrayOf(3,4),intArrayOf(5,6)))
        a.solution(arrayOf<IntArray>(intArrayOf(1),intArrayOf(2)),arrayOf<IntArray>(intArrayOf(3),intArrayOf(4)))
    }
}