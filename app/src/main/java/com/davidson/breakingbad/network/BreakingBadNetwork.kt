package com.davidson.breakingbad.network


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

class BreakingBadNetwork : ArrayList<BreakingBadNetwork.BreakingBadNetworkItem>() {
    @JsonClass(generateAdapter = true)
    data class BreakingBadNetworkItem(
        @Json(name = "appearance")
        val appearance: List<Int>,
        @Json(name = "better_call_saul_appearance")
        val betterCallSaulAppearance: List<Int>,
        @Json(name = "birthday")
        val birthday: String, // 09-07-1958
        @Json(name = "category")
        val category: String, // Breaking Bad
        @Json(name = "char_id")
        val charId: Int, // 1
        @Json(name = "img")
        val img: String, // https://images.amcnetworks.com/amc.com/wp-content/uploads/2015/04/cast_bb_700x1000_walter-white-lg.jpg
        @Json(name = "name")
        val name: String, // Walter White
        @Json(name = "nickname")
        val nickname: String, // Heisenberg
        @Json(name = "occupation")
        val occupation: List<String>,
        @Json(name = "portrayed")
        val portrayed: String, // Bryan Cranston
        @Json(name = "status")
        val status: String // Presumed dead
    )
}