package de.yourcloud.client.core.jrsync.utils;

/**
 * Enumaration of Log Level Codes form native code
 *
 * RS_LOG_CRIT - Ciritical Error such as hitting an umimplemented ase in librsync. Abort if it cannot return safely.
 * RS_LOG_WARNING - Serious error. The current operation has probably failed.
 * RS_LOG_INFO - Information on normal progress. May be suitable for a --verbose mode
 * RS_LOG_DEBUG - very detailed internal debug info. Useful when debugging librsync or programs that call it. The --verbose verbosity
 *
 */
public enum LogLevel {
    RS_LOG_CRIT,
    RS_LOG_ERR,
    RS_LOG_WARNING,
    RS_LOG_INFO,
    RS_LOG_DEBUG
}