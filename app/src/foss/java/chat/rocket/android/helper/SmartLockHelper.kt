package chat.rocket.android.helper

import android.app.Activity
import android.content.IntentSender
import androidx.fragment.app.FragmentActivity
import timber.log.Timber

const val REQUEST_CODE_FOR_SIGN_IN_REQUIRED = 1
const val REQUEST_CODE_FOR_MULTIPLE_ACCOUNTS_RESOLUTION = 2
const val REQUEST_CODE_FOR_SAVE_RESOLUTION = 3

class CredentialsClient{
    // stub
}

class Credential{
    companion object {
        const val EXTRA_KEY = "";
    }
}

class Credentials {
    companion object {
        fun getClient(activity: Activity): CredentialsClient {
            return CredentialsClient()
        }
    }
}

/**
 * This class handles some cases of Google Smart Lock for passwords like the request to retrieve
 * credentials, to retrieve sign-in hints and to store the credentials.
 *
 * See https://developers.google.com/identity/smartlock-passwords/android/overview for futher
 * information.
 */
object SmartLockHelper {

    /**
     * Requests for stored Google Smart Lock credentials.
     * Note that in case of exception it will try to start a sign in
     * ([REQUEST_CODE_FOR_SIGN_IN_REQUIRED]) or "multiple account"
     * ([REQUEST_CODE_FOR_MULTIPLE_ACCOUNTS_RESOLUTION]) resolution.
     *
     * @param credentialsClient The credential client.
     * @param activity The activity.
     * @return null or the [Credential] result.
     */
    fun requestStoredCredentials(
        credentialsClient: CredentialsClient,
        activity: Activity
    ): Credential? {
        // do nothing
        return null
    }

    /**
     * Saves a user credential to Google Smart Lock.
     * Note that in case of exception it will try to start a save resolution,
     * so the activity/fragment should expected for a request code
     * ([REQUEST_CODE_FOR_SAVE_RESOLUTION]) on onActivityResult call.
     *
     * @param credentialsClient The credential client.
     * @param activity The activity.
     * @param id The user id credential.
     * @param password The user password credential.
     */
    fun save(
        credentialsClient: CredentialsClient,
        activity: FragmentActivity,
        id: String,
        password: String
    ) {
        // do nothing
    }
}