package kristi71111.nocommandsigns;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(NoCommandSigns.MODID)
public class NoCommandSigns {
    public static final String MODID = "nocmdsigns";
    private static final Logger LOGGER = LogUtils.getLogger();
    public NoCommandSigns() {
        LOGGER.info("No more command signs!");
    }

}
