package com.example.dota;

import java.util.ArrayList;

public class HeroData {
    private static String[] image = new String[] {
            "https://liquipedia.net/commons/images/f/fa/Abaddon_Large.png",
            "https://liquipedia.net/commons/images/4/4e/Mars_Large.png",
            "https://liquipedia.net/commons/images/a/a4/Snapfire_Large.png",
            "https://liquipedia.net/commons/images/7/70/Anti-Mage_Large.png",
            "https://liquipedia.net/commons/images/c/c8/Juggernaut_Large.png",
            "https://liquipedia.net/commons/images/b/b5/Terrorblade_Large.png",
            "https://liquipedia.net/commons/images/5/5b/Invoker_Large.png",
            "https://liquipedia.net/commons/images/6/62/Queen_of_Pain_Large.png",
            "https://liquipedia.net/commons/images/c/c0/Tinker_Large.png"
    };
    private static String[] name = new String[] {
            "Abaddon",
            "Mars",
            "Snapfire",
            "Anti-Mage",
            "Juggernaut",
            "Terrorblade",
            "Invoker",
            "Queen of Pain",
            "Tinker"
    };

    private static String[] role = new String[] {
            "Support, Carry, Durable",
            "Carry, Initiator, Disabler, Durable",
            "Support, Nuker, Disabler, Escape",
            "Carry, Escape, Nuker",
            "Carry, Pusher, Escape",
            "Carry, Pusher, Nuker",
            "Carry, Nuker, Disabler, Escape, Pusher",
            "Carry, Nuker, Escape",
            "Carry, Nuker, Pusher"
    };

    public static String[] lore = new String[] {
            "The Font of Avernus is the source of a family's strength, a crack in primal stones from which vapors of prophetic power have issued for generations. Each newborn of the cavernous House Avernus is bathed in the black mist, and by this baptism they are given an innate connection to the mystic energies of the land. They grow up believing themselves fierce protectors of their lineal traditions, the customs of the realm—but what they really are protecting is the Font itself. And the motives of the mist are unclear. \n\nWhen the infant Abaddon was bathed in the Font, they say something went awry. In the child's eyes there flared a light of comprehension that startled all present and set the sacerdotes to whispering. He was raised with every expectation of following the path all scions of Avernus took—to train in war, that in times of need he might lead the family's army in defense of the ancestral lands.",
            "Mars, first son of heaven, spent a long existence waging endless war, and saw countless more crusades waged beneath the banner of his old name. Wars of conquest and of vengeance. Just and unjust... Always cruel. So much like his father, Mars indulged his basest impulses—with inclinations much more monstrous than those of Zeus—and he inflicted suffering untold. \n\nBut as the epochs vanished behind him, the selfish ways of his father—the ways of many amongst his godly kin, they who judged him despicable—eventually began to ring hollow. War for its own sake was no longer enough to satisfy his desires. For the first time in his ageless days, the god of war began to question to what ends he swung his glorious spear.",
            "Beatrix Snapfire and her dragon toad Mortimer are a welcome sight to the ragged folk who scratch out lives along the desert routes and oases scattered throughout Nanarak, the rain-forsaken gateway to the Outlands. \n\nAs well known for her unrivaled skills as a weaponsmith as for dispensing wisdom, mirth, and the meanest firesnap cookies the world has ever seen, Beadie's survived to a ripe old age in a young keen's trade by being quick with her wits and even quicker with her guns.",
            "The monks of Turstarkuri watched the rugged valleys below their mountain monastery as wave after wave of invaders swept through the lower kingdoms. Ascetic and pragmatic, in their remote monastic eyrie they remained aloof from mundane strife, wrapped in meditation that knew no gods or elements of magic. \n\nThen came the Legion of the Dead God, crusaders with a sinister mandate to replace all local worship with their Unliving Lord's poisonous nihilosophy. From a landscape that had known nothing but blood and battle for a thousand years, they tore the souls and bones of countless fallen legions and pitched them against Turstarkuri. The monastery stood scarcely a fortnight against the assault, and the few monks who bothered to surface from their meditations believed the invaders were but demonic visions sent to distract them from meditation. ",
            "No one has ever seen the face hidden beneath the mask of Yurnero the Juggernaut. It is only speculation that he even has one. For defying a corrupt lord, Yurnero was exiled from the ancient Isle of Masks—a punishment that saved his life. The isle soon after vanished beneath the waves in a night of vengeful magic. He alone remains to carry on the Isle's long Juggernaut tradition, one of ritual and swordplay. \n\nThe last practitioner of the art, Yurnero's confidence and courage are the result of endless practice; his inventive bladework proves that he has never stopped challenging himself. Still, his motives are as unreadable as his expression. For a hero who has lost everything twice over, he fights as if victory is a foregone conclusion.",
            "Terrorblade is the demon marauder—an outlaw hellion whom even other demons fear. A cosmic iconoclast, he stole from the Demon Lords, ignored the codified rites that should have bound his behavior, and broke every law of the seven Infernal Regions. For his crimes, he was taught this lesson: even Hell has a hell. A short, brutal trial ensued, with many dead on all sides, and he was finally incarcerated in Foulfell, a hidden dimension where demonkind imprison their own.",
            "In its earliest, and some would say most potent form, magic was primarily the art of memory. It required no technology, no wands or appurtenances other than the mind of the magician. All the trappings of ritual were merely mnemonic devices, meant to allow the practitioner to recall in rich detail the specific mental formulae that unlocked a spell's power. The greatest mages in those days were the ones blessed with the greatest memories, and yet so complex were the invocations that all wizards were forced to specialize. The most devoted might hope in a lifetime to have adequate recollection of three spells—four at most. Ordinary wizards were content to know two, and it was not uncommon for a village mage to know only one—with even that requiring him to consult grimoires as an aid against forgetfulness on the rare occasions when he might be called to use it.",
            "The Ecclesiast-King of Elze nursed a desire for pain—forbidden pain. In a less prominent political figure, such desires might be considered unwise, but in a monarch of his stature, to satisfy such thirsts would have threatened the virtue of the Divine Throne itself. Therefore he turned to his dungeon full of demonologists, promising freedom to whoever could summon a personal succubus of torment and bind it entirely to his service. The creature who arrived, Akasha by name, visited upon him such exquisite torments that he named her his Secret Queen, and he began to spend all his spare moments submitting to her clever torments—eventually abdicating all his responsibilities in his pursuit of the painful pleasures that only she could bring. ",
            "Boush the Tinker's diminutive race is known for its intelligence, its cunning, and its prickly relationship with magic. As a matter of pride, they survive by their wits, and use only those powers of nature that may be unlocked through rational methodologies. Even this forbearance has led to a great deal of trouble, as Boush can attest. Once a key investigator of natural law, Boush the Tinker led a vast intellectual investigation into the workings of nature, founding a subterranean laboratory in the rumored, mist-wreathed wastes of the Violet Plateau. "
    };

    public static ArrayList<HeroModel> getListData(){
        HeroModel heroModel = null;
        ArrayList<HeroModel> list = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            heroModel = new HeroModel();
            heroModel.setImage(image[i]);
            heroModel.setName(name[i]);
            heroModel.setRole(role[i]);
            heroModel.setLore(lore[i]);
            list.add((heroModel));
        }
        return list;
    }
}
