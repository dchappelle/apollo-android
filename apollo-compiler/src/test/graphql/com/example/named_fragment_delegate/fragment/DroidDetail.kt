// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.named_fragment_delegate.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseReader
import com.example.named_fragment_delegate.fragment.adapter.DroidDetailsImpl_ResponseAdapter
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
interface DroidDetail : GraphqlFragment {
  val __typename: String

  /**
   * What others call this droid
   */
  val name: String

  /**
   * This droid's primary function
   */
  val primaryFunction: String?

  /**
   * This droid's friends, or an empty list if they have none
   */
  val friends: List<Friend?>?

  /**
   * A character from the Star Wars universe
   */
  interface Friend {
    /**
     * The name of the character
     */
    val name: String
  }

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment DroidDetails on Droid {
        |  __typename
        |  name
        |  primaryFunction
        |  friends {
        |    name
        |  }
        |}
        """.trimMargin()

    operator fun invoke(reader: ResponseReader): DroidDetail {
      return DroidDetailsImpl_ResponseAdapter.fromResponse(reader)
    }
  }
}
