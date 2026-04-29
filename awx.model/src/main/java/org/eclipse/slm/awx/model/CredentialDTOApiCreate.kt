package org.eclipse.slm.awx.model

data class CredentialDTOApiCreate(
    val name: String,
    val description: String,
    val organization: Int?,
    val credential_type: Int,
    val inputs: Map<String, Object>
)
