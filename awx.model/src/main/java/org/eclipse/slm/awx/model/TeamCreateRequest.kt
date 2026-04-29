package org.eclipse.slm.awx.model

data class TeamCreateRequest(
        var name: String,
        var description: String="",
        var organization: Int=0,
)
