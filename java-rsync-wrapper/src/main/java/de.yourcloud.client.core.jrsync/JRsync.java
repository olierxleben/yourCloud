package de.yourcloud.client.core.jrsync;

import de.yourcloud.client.core.jrsync.utils.LogLevel;
import de.yourcloud.client.core.jrsync.utils.JRSResult;
import de.yourcloud.client.core.jrsync.utils.JRSSignature;

/**
 *
 */
public class JRsync {

    private LogLevel logLevel;

    /**
     * calls librsync class loader on runtime
     */
    static {
        System.loadLibrary("librsync");
    }

    /**
     * sets the loglevel
     * @param level
     */
    public void setTraceLevel(LogLevel level) {
        this.rs_trace_set_level(level);
        this.logLevel = level;
    }

    /**
     * get the loglevel
     * @return LogLevel
     */
    public LogLevel getTraceLevel() {
        return this.logLevel;
    }

    // native Interface
    // whole files

    /**
     * private
     * sets the trace level of librsync
     *
     * @param level
     */
    private native void rs_trace_set_level(LogLevel level);

    private native JRSResult rs_loadsig_files(char sig_in, char sig_out);

    //private native JRSResult rs_files_sig(char file_in, char file_out, int block_len, int string_len, rs_stats_t stats);

    //private native JRSResult rs_delta_sig(rs_signature_t sig, char file_in, char file_out);




}