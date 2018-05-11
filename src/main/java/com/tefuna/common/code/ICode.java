package com.tefuna.common.code;

/**
 * コード定義インタフェース。
 *
 * @author tefuna
 */
public interface ICode {

    String getCode();

    String getName();

    default boolean isEquals(String code) {
        return this.getCode().equals(code);
    }

}
