package ink.ptms.adyeshach.impl.description

import ink.ptms.adyeshach.common.api.Adyeshach

/**
 * @author 坏黑
 * @since 2022/6/19 18:07
 */
class PrepareMetaMasked(name: String, val mask: Byte, val value: Boolean) : PrepareMeta(name) {

    override fun register(entityClass: Class<*>, index: Int) {
        Adyeshach.api().getEntityMetadataHandler().registerEntityMetaMask(entityClass, index, name, mask, value)
    }

    override fun toString(): String {
        return "$name($mask, $value)"
    }
}