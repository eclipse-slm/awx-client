package org.eclipse.slm.awx.model

data class InventoryDTOApiCreate(
    var name: String,
    var organization: Int
) {
    var kind : String = ""
}
