package de.yourcloud.client.core.jrsync.utils;

/**
 * Enumaration of Return codes from native code
 *
 * RS_DONE              - processing complete
 * RS_BLOCKED           - operation cannot proceed atm
 * RS_RUNNING           - job is running atm
 * RS_IO_ERROR          - cli syntax error (perhaps parameter error from application)
 * RS_MEM_ERROR         - out of memory or similar conditions
 * RS_RS_INPUT_ENDED    - Input ended abruptly, cause of truncated files / dropped network
 * RS_BAD_MAGIC         - wrong magic number at the start of an input file. file is probably not in right format or from an incompatible version of librsync
 * RS_UNIMPLEMENTED     - "author is lazy"
 * RS_CORRUPT           - "unbelievable" value in input stream
 * RS_INTERNAL_ERROR    - lib bug or invalid input
 * RS_PARAM_ERROR       - bad value passed to lib
 * RS_EOF               - Reading from file reaches end of file.
 */
public enum JRSResult {
    RS_DONE,
    RS_BLOCKED,
    RS_RUNNING,
    RS_IO_ERROR,
    RS_SYNTAX_ERROR,
    RS_MEM_ERROR,
    RS_INPUT_ENDED,
    RS_BAD_MAGIC,
    RS_UNIMPLEMENTED,
    RS_CORRUPT,
    RS_INTERNAL_ERROR,
    RS_PARAM_ERROR,
    RS_EOF
}