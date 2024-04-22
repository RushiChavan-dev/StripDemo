/*
package com.harash1421.payment_integration.viewmodel

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.braintreepayments.api.DropInClient
import com.braintreepayments.api.DropInListener
import com.braintreepayments.api.DropInRequest
import com.braintreepayments.api.DropInResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BraintreeViewModel @Inject constructor() : ViewModel() {

    private val _paymentResult = MutableSharedFlow<String>()
    val paymentResult: SharedFlow<String> = _paymentResult
    private var dropInRequest: DropInRequest? = null

    fun setupClient(dropInClient: DropInClient) {
        dropInRequest = DropInRequest()
        dropInClient.setListener(object : DropInListener {
            override fun onDropInSuccess(dropInResult: DropInResult) {
                _paymentResult.tryEmit("Payment Success")
            }

            override fun onDropInFailure(error: Exception) {
                _paymentResult.tryEmit("Payment Failed")
            }
        })
    }

    fun startPayment(dropInClient: DropInClient) {
        viewModelScope.launch {
            dropInClient.launchDropIn(dropInRequest)
        }
    }
}
*/
