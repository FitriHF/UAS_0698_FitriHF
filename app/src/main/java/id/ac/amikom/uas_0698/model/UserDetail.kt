package id.ac.amikom.uas_0698.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class UserDetail(val name: String?,
                 val company: String?,
                 val location: String?,
                 val repositories: Int?,
                 val followers: Int?,
                 val following: Int?
) : Parcelable
