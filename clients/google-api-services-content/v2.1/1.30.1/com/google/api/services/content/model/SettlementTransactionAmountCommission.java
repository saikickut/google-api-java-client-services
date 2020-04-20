/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.content.model;

/**
 * Model definition for SettlementTransactionAmountCommission.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SettlementTransactionAmountCommission extends com.google.api.client.json.GenericJson {

  /**
   * The category of the commission.
   *
   * Acceptable values are:   - "`animalsAndPetSupplies`"  - "`dogCatFoodAndCatLitter`"  -
   * "`apparelAndAccessories`"  - "`shoesHandbagsAndSunglasses`"  - "`costumesAndAccessories`"  -
   * "`jewelry`"  - "`watches`"  - "`hobbiesArtsAndCrafts`"  - "`homeAndGarden`"  -
   * "`entertainmentCollectibles`"  - "`collectibleCoins`"  - "`sportsCollectibles`"  -
   * "`sportingGoods`"  - "`toysAndGames`"  - "`musicalInstruments`"  - "`giftCards`"  -
   * "`babyAndToddler`"  - "`babyFoodWipesAndDiapers`"  - "`businessAndIndustrial`"  -
   * "`camerasOpticsAndPhotography`"  - "`consumerElectronics`"  - "`electronicsAccessories`"  -
   * "`personalComputers`"  - "`videoGameConsoles`"  - "`foodAndGrocery`"  - "`beverages`"  -
   * "`tobaccoProducts`"  - "`furniture`"  - "`hardware`"  - "`buildingMaterials`"  - "`tools`"  -
   * "`healthAndPersonalCare`"  - "`beauty`"  - "`householdSupplies`"  - "`kitchenAndDining`"  -
   * "`majorAppliances`"  - "`luggageAndBags`"  - "`media`"  - "`officeSupplies`"  -
   * "`softwareAndVideoGames`"  - "`vehiclePartsAndAccessories`"  - "`vehicleTiresAndWheels`"  -
   * "`vehicles`"  - "`everythingElse`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * Rate of the commission in percentage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rate;

  /**
   * The category of the commission.
   *
   * Acceptable values are:   - "`animalsAndPetSupplies`"  - "`dogCatFoodAndCatLitter`"  -
   * "`apparelAndAccessories`"  - "`shoesHandbagsAndSunglasses`"  - "`costumesAndAccessories`"  -
   * "`jewelry`"  - "`watches`"  - "`hobbiesArtsAndCrafts`"  - "`homeAndGarden`"  -
   * "`entertainmentCollectibles`"  - "`collectibleCoins`"  - "`sportsCollectibles`"  -
   * "`sportingGoods`"  - "`toysAndGames`"  - "`musicalInstruments`"  - "`giftCards`"  -
   * "`babyAndToddler`"  - "`babyFoodWipesAndDiapers`"  - "`businessAndIndustrial`"  -
   * "`camerasOpticsAndPhotography`"  - "`consumerElectronics`"  - "`electronicsAccessories`"  -
   * "`personalComputers`"  - "`videoGameConsoles`"  - "`foodAndGrocery`"  - "`beverages`"  -
   * "`tobaccoProducts`"  - "`furniture`"  - "`hardware`"  - "`buildingMaterials`"  - "`tools`"  -
   * "`healthAndPersonalCare`"  - "`beauty`"  - "`householdSupplies`"  - "`kitchenAndDining`"  -
   * "`majorAppliances`"  - "`luggageAndBags`"  - "`media`"  - "`officeSupplies`"  -
   * "`softwareAndVideoGames`"  - "`vehiclePartsAndAccessories`"  - "`vehicleTiresAndWheels`"  -
   * "`vehicles`"  - "`everythingElse`"
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The category of the commission.
   *
   * Acceptable values are:   - "`animalsAndPetSupplies`"  - "`dogCatFoodAndCatLitter`"  -
   * "`apparelAndAccessories`"  - "`shoesHandbagsAndSunglasses`"  - "`costumesAndAccessories`"  -
   * "`jewelry`"  - "`watches`"  - "`hobbiesArtsAndCrafts`"  - "`homeAndGarden`"  -
   * "`entertainmentCollectibles`"  - "`collectibleCoins`"  - "`sportsCollectibles`"  -
   * "`sportingGoods`"  - "`toysAndGames`"  - "`musicalInstruments`"  - "`giftCards`"  -
   * "`babyAndToddler`"  - "`babyFoodWipesAndDiapers`"  - "`businessAndIndustrial`"  -
   * "`camerasOpticsAndPhotography`"  - "`consumerElectronics`"  - "`electronicsAccessories`"  -
   * "`personalComputers`"  - "`videoGameConsoles`"  - "`foodAndGrocery`"  - "`beverages`"  -
   * "`tobaccoProducts`"  - "`furniture`"  - "`hardware`"  - "`buildingMaterials`"  - "`tools`"  -
   * "`healthAndPersonalCare`"  - "`beauty`"  - "`householdSupplies`"  - "`kitchenAndDining`"  -
   * "`majorAppliances`"  - "`luggageAndBags`"  - "`media`"  - "`officeSupplies`"  -
   * "`softwareAndVideoGames`"  - "`vehiclePartsAndAccessories`"  - "`vehicleTiresAndWheels`"  -
   * "`vehicles`"  - "`everythingElse`"
   * @param category category or {@code null} for none
   */
  public SettlementTransactionAmountCommission setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * Rate of the commission in percentage.
   * @return value or {@code null} for none
   */
  public java.lang.String getRate() {
    return rate;
  }

  /**
   * Rate of the commission in percentage.
   * @param rate rate or {@code null} for none
   */
  public SettlementTransactionAmountCommission setRate(java.lang.String rate) {
    this.rate = rate;
    return this;
  }

  @Override
  public SettlementTransactionAmountCommission set(String fieldName, Object value) {
    return (SettlementTransactionAmountCommission) super.set(fieldName, value);
  }

  @Override
  public SettlementTransactionAmountCommission clone() {
    return (SettlementTransactionAmountCommission) super.clone();
  }

}
