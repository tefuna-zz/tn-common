package com.tefuna.common.util;

import java.util.Objects;

import com.tefuna.common.code.ICode;

/**
 * コード定義関連のUtilクラス。
 *
 * @author tefuna
 */
public final class CodeUtil {

	private CodeUtil() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 比較対象のcodeが比較元のコード定義との一致比較します。
	 *
	 * @param enumCode 比較元のコード定義enum
	 * @param code 比較対象
	 * @return 一致：true
	 */
	public static <E extends ICode> boolean isEquals(E enumCode, String code) {
		if (enumCode == null) {
			throw new NullPointerException("enumCode is null.");
		}

		return Objects.equals(enumCode.getCode(), code);
	}

}
