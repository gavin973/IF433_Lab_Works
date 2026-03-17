package oop_00000113142_RafaelGavinWiriano.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }
        is BattleState.LootDropped -> {
            println("Dapat item: ${event.item.name} (Rarity: ${event.item.rarity})")
        }
        is BattleState.GameOver -> {
            println("Game Over! Penyebab: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Berada di zona aman.")
        }
    }
}