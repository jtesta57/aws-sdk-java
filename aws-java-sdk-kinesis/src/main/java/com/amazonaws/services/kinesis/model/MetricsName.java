/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.kinesis.model;

/**
 * 
 */
public enum MetricsName {

    IncomingBytes("IncomingBytes"),
    IncomingRecords("IncomingRecords"),
    OutgoingBytes("OutgoingBytes"),
    OutgoingRecords("OutgoingRecords"),
    WriteProvisionedThroughputExceeded("WriteProvisionedThroughputExceeded"),
    ReadProvisionedThroughputExceeded("ReadProvisionedThroughputExceeded"),
    IteratorAgeMilliseconds("IteratorAgeMilliseconds"),
    ALL("ALL");

    private String value;

    private MetricsName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return MetricsName corresponding to the value
     */
    public static MetricsName fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("IncomingBytes".equals(value)) {
            return IncomingBytes;
        } else if ("IncomingRecords".equals(value)) {
            return IncomingRecords;
        } else if ("OutgoingBytes".equals(value)) {
            return OutgoingBytes;
        } else if ("OutgoingRecords".equals(value)) {
            return OutgoingRecords;
        } else if ("WriteProvisionedThroughputExceeded".equals(value)) {
            return WriteProvisionedThroughputExceeded;
        } else if ("ReadProvisionedThroughputExceeded".equals(value)) {
            return ReadProvisionedThroughputExceeded;
        } else if ("IteratorAgeMilliseconds".equals(value)) {
            return IteratorAgeMilliseconds;
        } else if ("ALL".equals(value)) {
            return ALL;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}