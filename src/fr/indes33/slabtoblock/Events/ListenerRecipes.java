package fr.indes33.slabtoblock.Events;

import fr.indes33.slabtoblock.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class ListenerRecipes implements Listener {

    private final Main pl;
    public ListenerRecipes(Main pl) {
        this.pl = pl;
        pl.getConfig();

        Bukkit.resetRecipes();

        NamespacedKey Oak_key = new NamespacedKey(this.pl, "stb_Oak");
        ShapedRecipe Oak = new ShapedRecipe(Oak_key, new ItemStack(Material.OAK_PLANKS, 2));
        Oak.shape("SS","SS");
        Oak.setIngredient('S', Material.OAK_SLAB);
        this.pl.getServer().addRecipe(Oak);

        NamespacedKey Spruce_key = new NamespacedKey(this.pl, "stb_Spruce");
        ShapedRecipe Spruce = new ShapedRecipe(Spruce_key, new ItemStack(Material.SPRUCE_PLANKS, 2));
        Spruce.shape("SS","SS");
        Spruce.setIngredient('S', Material.SPRUCE_SLAB);
        this.pl.getServer().addRecipe(Spruce);

        NamespacedKey Birch_key = new NamespacedKey(this.pl, "stb_Birch");
        ShapedRecipe Birch = new ShapedRecipe(Birch_key, new ItemStack(Material.BIRCH_PLANKS, 2));
        Birch.shape("SS","SS");
        Birch.setIngredient('S', Material.BIRCH_SLAB);
        this.pl.getServer().addRecipe(Birch);

        NamespacedKey Jungle_key = new NamespacedKey(this.pl, "stb_Jungle");
        ShapedRecipe Jungle = new ShapedRecipe(Jungle_key, new ItemStack(Material.JUNGLE_PLANKS, 2));
        Jungle.shape("SS","SS");
        Jungle.setIngredient('S', Material.JUNGLE_SLAB);
        this.pl.getServer().addRecipe(Jungle);

        NamespacedKey Acacia_key = new NamespacedKey(this.pl, "stb_Acacia");
        ShapedRecipe Acacia = new ShapedRecipe(Acacia_key, new ItemStack(Material.ACACIA_PLANKS, 2));
        Acacia.shape("SS","SS");
        Acacia.setIngredient('S', Material.ACACIA_SLAB);
        this.pl.getServer().addRecipe(Acacia);

        NamespacedKey DarkOak_key = new NamespacedKey(this.pl, "stb_DarkOak");
        ShapedRecipe DarkOak = new ShapedRecipe(DarkOak_key, new ItemStack(Material.DARK_OAK_PLANKS, 2));
        DarkOak.shape("SS","SS");
        DarkOak.setIngredient('S', Material.DARK_OAK_SLAB);
        this.pl.getServer().addRecipe(DarkOak);

        NamespacedKey Crimsom_key = new NamespacedKey(this.pl, "stb_Crimsom");
        ShapedRecipe Crimsom = new ShapedRecipe(Crimsom_key, new ItemStack(Material.CRIMSON_PLANKS, 2));
        Crimsom.shape("SS","SS");
        Crimsom.setIngredient('S', Material.CRIMSON_SLAB);
        this.pl.getServer().addRecipe(Crimsom);

        NamespacedKey Warped_key = new NamespacedKey(this.pl, "stb_Warped");
        ShapedRecipe Warped = new ShapedRecipe(Warped_key, new ItemStack(Material.WARPED_PLANKS, 2));
        Warped.shape("SS","SS");
        Warped.setIngredient('S', Material.WARPED_SLAB);
        this.pl.getServer().addRecipe(Warped);

        NamespacedKey Stone_key = new NamespacedKey(this.pl, "stb_Stone");
        ShapedRecipe Stone = new ShapedRecipe(Stone_key, new ItemStack(Material.STONE, 2));
        Stone.shape("SS","SS");
        Stone.setIngredient('S', Material.STONE_SLAB);
        this.pl.getServer().addRecipe(Stone);

        NamespacedKey SmoothStone_key = new NamespacedKey(this.pl, "stb_SmoothStone");
        ShapedRecipe SmoothStone = new ShapedRecipe(SmoothStone_key, new ItemStack(Material.SMOOTH_STONE, 2));
        SmoothStone.shape("SS","SS");
        SmoothStone.setIngredient('S', Material.SMOOTH_STONE_SLAB);
        this.pl.getServer().addRecipe(SmoothStone);

        NamespacedKey Sandstone_key = new NamespacedKey(this.pl, "stb_Sandstone");
        ShapedRecipe Sandstone = new ShapedRecipe(Sandstone_key, new ItemStack(Material.SANDSTONE, 2));
        Sandstone.shape("SS","SS");
        Sandstone.setIngredient('S', Material.SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(Sandstone);

        NamespacedKey CutSandstone_key = new NamespacedKey(this.pl, "stb_CutSandstone");
        ShapedRecipe CutSandstone = new ShapedRecipe(CutSandstone_key, new ItemStack(Material.CUT_SANDSTONE, 2));
        CutSandstone.shape("SS","SS");
        CutSandstone.setIngredient('S', Material.CUT_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(CutSandstone);

        NamespacedKey PetrifiedOak_key = new NamespacedKey(this.pl, "stb_PetrifiedOak");
        ShapedRecipe PetrifiedOak = new ShapedRecipe(PetrifiedOak_key, new ItemStack(Material.OAK_PLANKS, 2));
        PetrifiedOak.shape("SS","SS");
        PetrifiedOak.setIngredient('S', Material.PETRIFIED_OAK_SLAB);
        this.pl.getServer().addRecipe(PetrifiedOak);

        NamespacedKey Cobblestone_key = new NamespacedKey(this.pl, "stb_Cobblestone");
        ShapedRecipe Cobblestone = new ShapedRecipe(Cobblestone_key, new ItemStack(Material.COBBLESTONE, 2));
        Cobblestone.shape("SS","SS");
        Cobblestone.setIngredient('S', Material.COBBLESTONE_SLAB);
        this.pl.getServer().addRecipe(Cobblestone);

        NamespacedKey Brick_key = new NamespacedKey(this.pl, "stb_Brick");
        ShapedRecipe Brick = new ShapedRecipe(Brick_key, new ItemStack(Material.BRICKS, 2));
        Brick.shape("SS","SS");
        Brick.setIngredient('S', Material.BRICK_SLAB);
        this.pl.getServer().addRecipe(Brick);

        NamespacedKey StoneBricks_key = new NamespacedKey(this.pl, "stb_StoneBricks");
        ShapedRecipe StoneBricks = new ShapedRecipe(StoneBricks_key, new ItemStack(Material.STONE_BRICKS, 2));
        StoneBricks.shape("SS","SS");
        StoneBricks.setIngredient('S', Material.STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(StoneBricks);

        NamespacedKey NetherBrick_key = new NamespacedKey(this.pl, "stb_NetherBrick");
        ShapedRecipe NetherBrick = new ShapedRecipe(NetherBrick_key, new ItemStack(Material.NETHER_BRICKS, 2));
        NetherBrick.shape("SS","SS");
        NetherBrick.setIngredient('S', Material.NETHER_BRICK_SLAB);
        this.pl.getServer().addRecipe(NetherBrick);

        NamespacedKey Quartz_key = new NamespacedKey(this.pl, "stb_Quartz");
        ShapedRecipe Quartz = new ShapedRecipe(Quartz_key, new ItemStack(Material.QUARTZ_BLOCK, 2));
        Quartz.shape("SS","SS");
        Quartz.setIngredient('S', Material.QUARTZ_SLAB);
        this.pl.getServer().addRecipe(Quartz);

        NamespacedKey RedSandstone_key = new NamespacedKey(this.pl, "stb_RedSandstone");
        ShapedRecipe RedSandstone = new ShapedRecipe(RedSandstone_key, new ItemStack(Material.RED_SANDSTONE, 2));
        RedSandstone.shape("SS","SS");
        RedSandstone.setIngredient('S', Material.RED_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(RedSandstone);

        NamespacedKey CutRedSandstone_key = new NamespacedKey(this.pl, "stb_CutRedSandstone");
        ShapedRecipe CutRedSandstone = new ShapedRecipe(CutRedSandstone_key, new ItemStack(Material.CUT_RED_SANDSTONE, 2));
        CutRedSandstone.shape("SS","SS");
        CutRedSandstone.setIngredient('S', Material.CUT_RED_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(CutRedSandstone);

        NamespacedKey Purpur_key = new NamespacedKey(this.pl, "stb_Purpur");
        ShapedRecipe Purpur = new ShapedRecipe(Purpur_key, new ItemStack(Material.PURPUR_BLOCK, 2));
        Purpur.shape("SS","SS");
        Purpur.setIngredient('S', Material.PURPUR_SLAB);
        this.pl.getServer().addRecipe(Purpur);

        NamespacedKey Prismarine_key = new NamespacedKey(this.pl, "stb_Prismarine");
        ShapedRecipe Prismarine = new ShapedRecipe(Prismarine_key, new ItemStack(Material.PRISMARINE, 2));
        Prismarine.shape("SS","SS");
        Prismarine.setIngredient('S', Material.PRISMARINE_SLAB);
        this.pl.getServer().addRecipe(Prismarine);

        NamespacedKey PrismarineBricks_key = new NamespacedKey(this.pl, "stb_PrismarineBricks");
        ShapedRecipe PrismarineBricks = new ShapedRecipe(PrismarineBricks_key, new ItemStack(Material.PRISMARINE_BRICKS, 2));
        PrismarineBricks.shape("SS","SS");
        PrismarineBricks.setIngredient('S', Material.PRISMARINE_BRICK_SLAB);
        this.pl.getServer().addRecipe(PrismarineBricks);

        NamespacedKey DarkPrismarine_key = new NamespacedKey(this.pl, "stb_DarkPrismarine");
        ShapedRecipe DarkPrismarine = new ShapedRecipe(DarkPrismarine_key, new ItemStack(Material.DARK_PRISMARINE, 2));
        DarkPrismarine.shape("SS","SS");
        DarkPrismarine.setIngredient('S', Material.DARK_PRISMARINE_SLAB);
        this.pl.getServer().addRecipe(DarkPrismarine);

        NamespacedKey PolishedGranite_key = new NamespacedKey(this.pl, "stb_PolishedGranite");
        ShapedRecipe PolishedGranite = new ShapedRecipe(PolishedGranite_key, new ItemStack(Material.POLISHED_GRANITE, 2));
        PolishedGranite.shape("SS","SS");
        PolishedGranite.setIngredient('S', Material.POLISHED_GRANITE_SLAB);
        this.pl.getServer().addRecipe(PolishedGranite);

        NamespacedKey SmoothRedSandstone_key = new NamespacedKey(this.pl, "stb_SmoothRedSandstone");
        ShapedRecipe SmoothRedSandstone = new ShapedRecipe(SmoothRedSandstone_key, new ItemStack(Material.SMOOTH_RED_SANDSTONE, 2));
        SmoothRedSandstone.shape("SS","SS");
        SmoothRedSandstone.setIngredient('S', Material.SMOOTH_RED_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(SmoothRedSandstone);

        NamespacedKey MossyStoneBrick_key = new NamespacedKey(this.pl, "stb_MossyStoneBrick");
        ShapedRecipe MossyStoneBrick = new ShapedRecipe(MossyStoneBrick_key, new ItemStack(Material.MOSSY_STONE_BRICKS, 2));
        MossyStoneBrick.shape("SS","SS");
        MossyStoneBrick.setIngredient('S', Material.MOSSY_STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(MossyStoneBrick);

        NamespacedKey PolishedDiorite_key = new NamespacedKey(this.pl, "stb_PolishedDiorite");
        ShapedRecipe PolishedDiorite = new ShapedRecipe(PolishedDiorite_key, new ItemStack(Material.POLISHED_DIORITE, 2));
        PolishedDiorite.shape("SS","SS");
        PolishedDiorite.setIngredient('S', Material.POLISHED_DIORITE_SLAB);
        this.pl.getServer().addRecipe(PolishedDiorite);

        NamespacedKey MossyCobblestone_key = new NamespacedKey(this.pl, "stb_MossyCobblestone");
        ShapedRecipe MossyCobblestone = new ShapedRecipe(MossyCobblestone_key, new ItemStack(Material.MOSSY_COBBLESTONE, 2));
        MossyCobblestone.shape("SS","SS");
        MossyCobblestone.setIngredient('S', Material.MOSSY_COBBLESTONE_SLAB);
        this.pl.getServer().addRecipe(MossyCobblestone);

        NamespacedKey EndStoneBrick_key = new NamespacedKey(this.pl, "stb_EndStoneBrick");
        ShapedRecipe EndStoneBrick = new ShapedRecipe(EndStoneBrick_key, new ItemStack(Material.END_STONE, 2));
        EndStoneBrick.shape("SS","SS");
        EndStoneBrick.setIngredient('S', Material.END_STONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(EndStoneBrick);

        NamespacedKey SmoothSandstone_key = new NamespacedKey(this.pl, "stb_SmoothSandstone");
        ShapedRecipe SmoothSandstone = new ShapedRecipe(SmoothSandstone_key, new ItemStack(Material.SMOOTH_SANDSTONE, 2));
        SmoothSandstone.shape("SS","SS");
        SmoothSandstone.setIngredient('S', Material.SMOOTH_SANDSTONE_SLAB);
        this.pl.getServer().addRecipe(SmoothSandstone);

        NamespacedKey SmoothQuartz_key = new NamespacedKey(this.pl, "stb_SmoothQuartz");
        ShapedRecipe SmoothQuartz = new ShapedRecipe(SmoothQuartz_key, new ItemStack(Material.SMOOTH_QUARTZ, 2));
        SmoothQuartz.shape("SS","SS");
        SmoothQuartz.setIngredient('S', Material.SMOOTH_QUARTZ_SLAB);
        this.pl.getServer().addRecipe(SmoothQuartz);

        NamespacedKey Granite_key = new NamespacedKey(this.pl, "stb_Granite");
        ShapedRecipe Granite = new ShapedRecipe(Granite_key, new ItemStack(Material.GRANITE, 2));
        Granite.shape("SS","SS");
        Granite.setIngredient('S', Material.GRANITE_SLAB);
        this.pl.getServer().addRecipe(Granite);

        NamespacedKey Andesite_key = new NamespacedKey(this.pl, "stb_Andesite");
        ShapedRecipe Andesite = new ShapedRecipe(Andesite_key, new ItemStack(Material.ANDESITE, 2));
        Andesite.shape("SS","SS");
        Andesite.setIngredient('S', Material.ANDESITE_SLAB);
        this.pl.getServer().addRecipe(Andesite);

        NamespacedKey RedNetherBrick_key = new NamespacedKey(this.pl, "stb_RedNetherBrick");
        ShapedRecipe RedNetherBrick = new ShapedRecipe(RedNetherBrick_key, new ItemStack(Material.RED_NETHER_BRICKS, 2));
        RedNetherBrick.shape("SS","SS");
        RedNetherBrick.setIngredient('S', Material.RED_NETHER_BRICK_SLAB);
        this.pl.getServer().addRecipe(RedNetherBrick);

        NamespacedKey PolishedAndesite_key = new NamespacedKey(this.pl, "stb_PolishedAndesite");
        ShapedRecipe PolishedAndesite = new ShapedRecipe(PolishedAndesite_key, new ItemStack(Material.POLISHED_ANDESITE, 2));
        PolishedAndesite.shape("SS","SS");
        PolishedAndesite.setIngredient('S', Material.POLISHED_ANDESITE_SLAB);
        this.pl.getServer().addRecipe(PolishedAndesite);

        NamespacedKey Diorite_key = new NamespacedKey(this.pl, "stb_Diorite");
        ShapedRecipe Diorite = new ShapedRecipe(Diorite_key, new ItemStack(Material.DIORITE, 2));
        Diorite.shape("SS","SS");
        Diorite.setIngredient('S', Material.DIORITE_SLAB);
        this.pl.getServer().addRecipe(Diorite);

        NamespacedKey BlackStone_key = new NamespacedKey(this.pl, "stb_BlackStone");
        ShapedRecipe BlackStone = new ShapedRecipe(BlackStone_key, new ItemStack(Material.BLACKSTONE, 2));
        BlackStone.shape("SS","SS");
        BlackStone.setIngredient('S', Material.BLACKSTONE_SLAB);
        this.pl.getServer().addRecipe(BlackStone);

        NamespacedKey PolishedBlackStone_key = new NamespacedKey(this.pl, "stb_PolishedBlackStone");
        ShapedRecipe PolishedBlackStone = new ShapedRecipe(PolishedBlackStone_key, new ItemStack(Material.POLISHED_BLACKSTONE, 2));
        PolishedBlackStone.shape("SS","SS");
        PolishedBlackStone.setIngredient('S', Material.POLISHED_BLACKSTONE_SLAB);
        this.pl.getServer().addRecipe(PolishedBlackStone);

        NamespacedKey PolishedBlackStoneBrick_key = new NamespacedKey(this.pl, "stb_PolishedBlackStoneBrick");
        ShapedRecipe PolishedBlackStoneBrick = new ShapedRecipe(PolishedBlackStoneBrick_key, new ItemStack(Material.POLISHED_BLACKSTONE_BRICKS, 2));
        PolishedBlackStoneBrick.shape("SS","SS");
        PolishedBlackStoneBrick.setIngredient('S', Material.POLISHED_BLACKSTONE_BRICK_SLAB);
        this.pl.getServer().addRecipe(PolishedBlackStoneBrick);
    }
}
