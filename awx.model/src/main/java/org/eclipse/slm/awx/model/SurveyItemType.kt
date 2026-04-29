package org.eclipse.slm.awx.model

import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("SurveyItemType")
enum class SurveyItemType {
    text,
    password,
    integer,
    float,
    multiplechoice,
    multiselect
}
