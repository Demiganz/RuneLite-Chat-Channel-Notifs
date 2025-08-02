package com.chat_channel_notifs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class ChatChannelNotifsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ChatChannelNotifsPlugin.class);
		RuneLite.main(args);
	}
} 