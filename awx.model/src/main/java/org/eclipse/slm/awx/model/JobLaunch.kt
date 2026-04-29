package org.eclipse.slm.awx.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class JobLaunch(

        var job: Int,

        var ignored_fields: Map<String, Any>? = null,
)
