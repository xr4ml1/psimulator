package shell;

import java.util.regex.Pattern;
import logging.Logger;
import logging.LoggingCategory;
import shell.SignalCatchAble.Signal;
import telnetd.io.TerminalIO;

/**
 *
 * @author Martin Lukáš <lukasma1@fit.cvut.cz>
 */
public class ShellUtils {

	public static Pattern printablePatter = Pattern.compile(ShellUtils.getPrintableRegExp());

	public static String getPrintableRegExp() {
		return "\\p{Print}";
	}

	public static void handleControlCodes(SignalCatchAble catchAble, int code) {

		switch (code) {
			case TerminalIO.CTRL_C:
				Logger.log(Logger.DEBUG, LoggingCategory.TELNET, "Přečteno CTRL+C");
				catchAble.catchSignal(Signal.CTRL_C);
				break;
			case TerminalIO.CTRL_Z:
				Logger.log(Logger.DEBUG, LoggingCategory.TELNET, "Přečteno CTRL+Z");
				catchAble.catchSignal(Signal.CTRL_Z);
				break;
			case TerminalIO.CTRL_D:
				Logger.log(Logger.DEBUG, LoggingCategory.TELNET, "Přečteno CTRL+D");
				catchAble.catchSignal(Signal.CTRL_D);
				break;

		}

	}

	public static boolean isPrintable(int znakInt) {
		return ShellUtils.printablePatter.matcher(String.valueOf((char) znakInt)).find();
	}
}
