package id.ac.amikom.uas_0698.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Follower(val avatar: String?,
                    val username: String?,
                    val id: Int?,
                    val type: String?
) : Parcelable
